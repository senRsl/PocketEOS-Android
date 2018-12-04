package com.oraclechain.pocketeos.modules.leftdrawer.messagecenter;

import java.util.List;

import com.oraclechain.pocketeos.base.BaseView;
import com.oraclechain.pocketeos.bean.MessageCenterBean;

/**
 * Created by pocketEos on 2017/12/26.
 * 获取friendslist
 */
public interface MessageCenterView extends BaseView {

    void getListDataHttp(List<MessageCenterBean.DataBean> messageBean);

    void getDataHttpFail(String msg);
}
