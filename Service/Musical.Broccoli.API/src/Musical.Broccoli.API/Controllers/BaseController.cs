using Business.Handlers.Request;
using Common.DTOs;
using Microsoft.AspNetCore.Mvc;

namespace Musical.Broccoli.API.Controllers
{
    public interface IBaseController<T> where T : BaseDTO
    {
        IActionResult Get([FromBody] ReadRequest request);

        IActionResult Post([FromBody] ReadWriteRequest<T> request);

        IActionResult Put([FromBody] ReadWriteRequest<T> request);

        IActionResult Delete([FromBody] ReadWriteRequest<T> request);
    }
}