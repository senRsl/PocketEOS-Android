package com.oraclechain.pocketeos.modules.dapp;

import java.util.List;

import com.oraclechain.pocketeos.base.BaseView;
import com.oraclechain.pocketeos.bean.DappBean;
import com.oraclechain.pocketeos.bean.DappCommpanyBean;

/**
 * Created by pocketEos on 2017/12/26.
 * 获取friendslist
 */

public interface DappView extends BaseView {
    void getDappCommpanyDataHttp(List<DappCommpanyBean.DataBean> dappCommpanyBean);

    void getDappDataHttp(List<DappBean.DataBean> dappBean);

    void getDataHttpFail(String msg);
}
