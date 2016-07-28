package com.geh.uc.server.service;

        import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Ge Hui on 2016/6/18.
 */
public interface IService<T, V> {

    @Transactional
    public T excecute(V req);
}
