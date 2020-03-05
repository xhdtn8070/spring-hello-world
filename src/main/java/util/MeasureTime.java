package util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@EnableAspectJAutoProxy
@Component
@Aspect
public class MeasureTime {
    @Around(value = "execution(* service.SearchServiceImpl.*Search(..))")
    public Object measureTime(ProceedingJoinPoint joinPoint) throws Throwable {
        StopWatch stopWatch = new StopWatch("MeasureTime");
        stopWatch.start();
        Object result = joinPoint.proceed();
        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
        return result;
    }
}
