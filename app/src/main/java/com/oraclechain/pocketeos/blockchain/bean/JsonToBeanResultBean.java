package com.oraclechain.pocketeos.blockchain.bean;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;

/**
 * Created by swapnibble on 2017-09-12.
 */

public class JsonToBeanResultBean {

    @Expose
    private String binargs;

    @Expose
    private List<String> required_scope;

    @Expose
    private List<String> required_auth;

    public String getBinargs() {
        return binargs == null ? "" : binargs;
    }

    public void setBinargs(String binargs) {
        this.binargs = binargs;
    }

    public List<String> getRequired_scope() {
        if (required_scope == null) {
            return new ArrayList<>();
        }
        return required_scope;
    }

    public void setRequired_scope(List<String> required_scope) {
        this.required_scope = required_scope;
    }

    public List<String> getRequired_auth() {
        if (required_auth == null) {
            return new ArrayList<>();
        }
        return required_auth;
    }

    public void setRequired_auth(List<String> required_auth) {
        this.required_auth = required_auth;
    }
}
