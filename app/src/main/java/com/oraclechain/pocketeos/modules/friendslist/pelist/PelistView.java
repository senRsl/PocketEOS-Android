package com.oraclechain.pocketeos.modules.friendslist.pelist;

import java.util.List;

import com.oraclechain.pocketeos.base.BaseView;
import com.oraclechain.pocketeos.bean.PelistBean;

/**
 * Created by pocketEos on 2017/12/26.
 * 获取friendslist
 */
public interface PelistView extends BaseView {

    void getListDataHttp(List<PelistBean.DataBean> pelistBean);

    void getDataHttpFail(String msg);
}
