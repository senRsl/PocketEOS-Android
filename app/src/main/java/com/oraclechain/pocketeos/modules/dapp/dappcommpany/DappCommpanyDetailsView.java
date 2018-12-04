package com.oraclechain.pocketeos.modules.dapp.dappcommpany;

import java.util.List;

import com.oraclechain.pocketeos.base.BaseView;
import com.oraclechain.pocketeos.bean.DappBean;

/**
 * Created by pocketEos on 2017/12/26.
 * 获取friendslist
 */
public interface DappCommpanyDetailsView extends BaseView {

    void getDappCommpanyDataHttp(List<DappBean.DataBean> dappBean);


    void getDataHttpFail(String msg);
}
