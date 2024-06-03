//package com.ggtest;
//
//import com.baomidou.mybatisplus.extension.service.IService;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.List;
//import java.util.Objects;
//import java.util.function.BiFunction;
//import java.util.stream.Collectors;
//
//public class ServiceStrategy {
//
//    private Map<Integer, IService> serviceMap;
//
//    @Autowired(required = false)
//    public void serviceStrategy(List<IService> serviceList) {
//        this.serviceMap = serviceList.stream().collect(Collectors.toMap(Objects.requireNonNull(IService::getCode), s -> s, ((s1, s2) -> s2)));
//    }
//
//    public IService getService(Integer code) {
//        return serviceMap.get(code);
//    }
//
//    public String execute(Integer code, String arg, BiFunction<IService, String, String> function) {
//        IService service = getService(code);
//        return function.apply(service, arg);
//    }
//
//    public String execute(Integer code, String arg, String arg2, TriFunction<IService, String, String, String> function) {
//        IService service = getService(code);
//        return function.apply(service, arg, arg2);
//    }
//}