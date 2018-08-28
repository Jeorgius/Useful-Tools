import javax.ws.rs.container.ContainerRequestContext;
        import javax.ws.rs.container.ContainerResponseContext;
        import javax.ws.rs.container.ContainerResponseFilter;
        import javax.ws.rs.container.PreMatching;
        import javax.ws.rs.ext.Provider;
        import java.io.IOException;

@Provider
@PreMatching
public class CorsProvider implements ContainerResponseFilter {
    @Override
    public void filter(ContainerRequestContext req, ContainerResponseContext resp) throws IOException {
        resp.getHeaders().add("Access-Control-Allow-Origin", "http://localhost:4200");
        resp.getHeaders().add("Access-Control-Allow-Headers", "origin, content-type, accept, authorization");
        resp.getHeaders().add("Access-Control-Allow-Credentials", "true");
        resp.getHeaders().add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD");
        resp.getHeaders().add("Access-Control-Max-Age", "1209600");
    }
}
