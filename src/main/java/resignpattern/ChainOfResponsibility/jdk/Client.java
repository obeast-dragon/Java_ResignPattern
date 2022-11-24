package resignpattern.ChainOfResponsibility.jdk;


import resignpattern.ChainOfResponsibility.jdk.filter.FirstFilter;
import resignpattern.ChainOfResponsibility.jdk.filter.SecondFilter;

public class Client {
    public static void main(String[] args) {
        Request  req = null;
        Response res = null ;

        FilterChain filterChain = new FilterChain();
        filterChain
                .addFilter(new FirstFilter())
                .addFilter(new SecondFilter());
        filterChain.doFilter(req,res);
    }
}
