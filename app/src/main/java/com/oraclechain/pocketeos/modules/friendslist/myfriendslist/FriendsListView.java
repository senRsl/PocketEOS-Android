package com.oraclechain.pocketeos.modules.friendslist.myfriendslist;

import java.util.ArrayList;

import com.oraclechain.pocketeos.base.BaseView;
import com.oraclechain.pocketeos.bean.User;

/**
 * Created by pocketEos on 2017/12/26.
 * 获取friendslist
 */

public interface FriendsListView extends BaseView {

    void getDataHttp(ArrayList<User> mDataBeanArrayList);


    void getDataHttpFail(String msg);
}
