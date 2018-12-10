package spring.springcloud_zuul_10000.zuulfilte;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//zuul的请求过滤器
@Component
public class MyzuulFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    //请求必须携带token参数,不然没法通过
    @Override
    public Object run() throws ZuulException {
        //获得请求
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        String token = request.getParameter("token");
        if (token == null) {
            //自己使用response响应,zuul不要占用
            context.setSendZuulResponse(false);
            try {
                HttpServletResponse response = context.getResponse();
                response.setCharacterEncoding("utf-8");
                response.setContentType("text/html;charset=utf-8");
                response.getWriter().println("没带");
                response.getClass();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return null;//放行
    }
}
