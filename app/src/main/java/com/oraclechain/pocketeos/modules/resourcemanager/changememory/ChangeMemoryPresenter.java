package com.oraclechain.pocketeos.modules.resourcemanager.changememory;

import java.util.HashMap;

import com.lzy.okgo.model.Response;
import com.oraclechain.pocketeos.base.BasePresent;
import com.oraclechain.pocketeos.base.BaseUrl;
import com.oraclechain.pocketeos.bean.AccountDetailsBean;
import com.oraclechain.pocketeos.bean.ResponseBean;
import com.oraclechain.pocketeos.bean.TableResultBean;
import com.oraclechain.pocketeos.net.HttpUtils;
import com.oraclechain.pocketeos.net.callbck.JsonCallback;

import android.content.Context;

/**
 * Created by pocketEos on 2017/12/26.
 */

public class ChangeMemoryPresenter extends BasePresent<ChangeMemoryView> {
    private Context mContext;

    public ChangeMemoryPresenter(Context context) {
        this.mContext = context;
    }

    public void getTabData() {

        HttpUtils.postRequest(BaseUrl.HTTP_eos_get_table, mContext, "{\"json\":true,\"code\":\"eosio\",\"scope\":\"eosio\",\"table\":\"rammarket\",\"table_key\":\"\",\"lower_bound\":\"\",\"upper_bound\":\"\",\"limit\":10}", new JsonCallback<ResponseBean<TableResultBean.DataBean>>() {
            @Override
            public void onSuccess(Response<ResponseBean<TableResultBean.DataBean>> response) {
                if (response.body().code == 0) {
                    view.getTableDataHttp(response.body().data);
                } else {
                    view.getDataHttpFail(response.body().message);
                }
            }
        });

    }

    public void getAccounteData(String account) {

        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("name", account);
        HttpUtils.postRequest(BaseUrl.HTTP_eos_get_account, mContext, hashMap, new JsonCallback<ResponseBean<AccountDetailsBean>>() {
            @Override
            public void onSuccess(Response<ResponseBean<AccountDetailsBean>> response) {
                if (response.body().code == 0) {
                    view.getAccountDetailsDataHttp(response.body().data);
                } else {
                    view.getDataHttpFail(response.body().message);
                }
            }
        });


    }

}
