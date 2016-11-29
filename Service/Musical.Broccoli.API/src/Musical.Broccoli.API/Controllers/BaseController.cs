using Common.DTOs;
using Business.Handlers.Handlers;
using Microsoft.AspNetCore.Mvc;
using Business.Handlers.Request;
using System;

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