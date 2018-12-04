package com.oraclechain.pocketeos.modules.leftdrawer.suggestionfeedback;

import java.util.List;

import com.oraclechain.pocketeos.base.BaseView;
import com.oraclechain.pocketeos.bean.SuggestionBean;

/**
 * Created by pocketEos on 2017/12/26.
 * 获取friendslist
 */
public interface SuggestionFeedbackView extends BaseView {

    void postSuggestionHttp();

    void getSuggestionListHttp(List<SuggestionBean.DataBean> suggestionBean);

    void getDataHttpFail(String msg);
}
