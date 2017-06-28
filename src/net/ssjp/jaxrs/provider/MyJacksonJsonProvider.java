package net.ssjp.jaxrs.provider;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import javax.inject.Singleton;

@Provider
@Produces(MediaType.APPLICATION_JSON)
@Singleton
public class MyJacksonJsonProvider implements ContextResolver<ObjectMapper>{

	private static final ObjectMapper MAPPER = new ObjectMapper();
	
	static{
		MAPPER.setSerializationInclusion(JsonSerialize.Inclusion.NON_EMPTY);
	}
	
	@Override
	public ObjectMapper getContext(Class<?> type) {
		System.out.println("MyJacksonProvider.getContext(): "+type);
		return MAPPER;
	}

}
