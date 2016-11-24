using Common.DTOs;
using DataAccessLayer.Entities;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using AutoMapper;
using DataAccessLayer.Repositories.Contracts;
using Business.Controllers.Petition;
using Business.Contracts;
using Business.Controllers.Response;
using Business.Controllers.PetitionValidators;
using System.Security.Authentication;
using Business.Connectors.Petition;

namespace Business.Connectors
{
    public class SessionConnector : BaseConnector<SessionDTO, Session>, ISessionConnector
    {
        public SessionConnector(IBaseRepository<Session> repository, IMapper mapper) : base(repository, mapper)
        {
        }
        protected override BusinessResponse<SessionDTO> Get(BusinessPetition<SessionDTO> petition)
        {
            if (!Validate(petition, new SessionGetValidation())) throw new AuthenticationException();
            return base.Get(petition);
        }
        protected override BusinessResponse<SessionDTO> Save(BusinessPetition<SessionDTO> petition)
        {
            if (!Validate(petition, new SessionSaveValidation())) throw new AuthenticationException();
            return base.Save(petition);
        }
        protected override BusinessResponse<SessionDTO> Delete(BusinessPetition<SessionDTO> petition)
        {
            if (!Validate(petition, new SessionDeleteAndUpdateValidation())) throw new AuthenticationException();
            return base.Delete(petition);
        }
        protected override BusinessResponse<SessionDTO> Update(BusinessPetition<SessionDTO> petition)
        {
            if (!Validate(petition, new SessionDeleteAndUpdateValidation())) throw new AuthenticationException();
            return base.Update(petition);
        }
    }

        internal sealed class SessionDeleteAndUpdateValidation : PetitionValidation<SessionDTO>
        {
            public override bool Validate(BusinessPetition<SessionDTO> petition)
            {
                return true;
            }
        }
        internal sealed class SessionGetValidation : PetitionValidation<SessionDTO>
        {
            public override bool Validate(BusinessPetition<SessionDTO> petition)
            {
                return petition.RequestingUser != null;
            }
        }
        internal sealed class SessionSaveValidation : PetitionValidation<SessionDTO>
        {
            public override bool Validate(BusinessPetition<SessionDTO> petition)
            {
                return true;
            }
        }
    }

