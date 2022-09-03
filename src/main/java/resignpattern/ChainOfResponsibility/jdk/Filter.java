package resignpattern.ChainOfResponsibility.jdk;
public interface Filter {
    public void doFilter(Request req,Response res,FilterChain c);
}
