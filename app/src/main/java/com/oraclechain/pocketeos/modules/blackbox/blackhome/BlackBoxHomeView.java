package com.oraclechain.pocketeos.modules.blackbox.blackhome;

import java.util.List;

import com.oraclechain.pocketeos.base.BaseView;
import com.oraclechain.pocketeos.bean.AccountWithCoinBean;

/**
 * Created by pocketEos on 2018/1/18.
 */

public interface BlackBoxHomeView extends BaseView {

    void getAccountDetailsDataHttp(List<AccountWithCoinBean> mAccountWithCoinBeen);

    void getDataHttpFail(String msg);
}
