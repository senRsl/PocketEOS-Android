package com.oraclechain.pocketeos.modules.transaction.transferaccounts.switchfriend;

import java.util.List;

import com.oraclechain.pocketeos.base.BaseView;
import com.oraclechain.pocketeos.bean.FriendsListInfoBean;

/**
 * Created by pocketEos on 2017/12/26.
 * 获取friendslist
 */

public interface SwitchFriendView extends BaseView {

    void getDataHttp(List<FriendsListInfoBean> dataBeanList);


    void getDataHttpFail(String msg);
}
