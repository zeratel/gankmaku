package me.pkliang.gankmaku.domain.interactor;

import me.pkliang.gankmaku.domain.entity.Response;
import rx.Observable;

/**
 * Created by Omistaja on 8/11/2015.
 */
public interface GetIOSUseCase {
    Observable<Response> execute(int pageSize, int page);
}
