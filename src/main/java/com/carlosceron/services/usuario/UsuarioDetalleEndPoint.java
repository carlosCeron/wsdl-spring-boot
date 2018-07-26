package com.carlosceron.services.usuario;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.carlosceron.usuarios.GetUsuarioDetalleRequest;
import com.carlosceron.usuarios.GetUsuarioDetalleResponse;
import com.carlosceron.usuarios.UsuarioDetalle;

@Endpoint
public class UsuarioDetalleEndPoint {
	
	
	@PayloadRoot(namespace = "http://carlosceron.com/usuarios", localPart = "GetUsuarioDetalleRequest")
	@ResponsePayload
	public GetUsuarioDetalleResponse usuarioDetalleRequest(@RequestPayload GetUsuarioDetalleRequest request) {
		
		GetUsuarioDetalleResponse getUsuarioDetalleResponse = new GetUsuarioDetalleResponse();
		
		UsuarioDetalle  usuarioDetalle = new UsuarioDetalle();
		usuarioDetalle.setId(request.getId());
		usuarioDetalle.setNombre(request.getNombre());
		usuarioDetalle.setCorreo("carlosceron@test.com");
		
		getUsuarioDetalleResponse.setUsuarioDetalle(usuarioDetalle);
		
		return getUsuarioDetalleResponse;
		
	}
	
}
