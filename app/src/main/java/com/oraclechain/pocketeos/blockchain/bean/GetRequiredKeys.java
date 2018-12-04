package com.oraclechain.pocketeos.blockchain.bean;


import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.oraclechain.pocketeos.blockchain.chain.SignedTransaction;

/**
 * Created by swapnibble on 2017-09-12.
 */

public class GetRequiredKeys {
    @Expose
    private SignedTransaction transaction;
    @Expose
    private List<String> available_keys;

    public GetRequiredKeys(SignedTransaction transaction, List<String> keys) {
        this.transaction = transaction;

        if (null != keys) {
            available_keys = new ArrayList<>(keys);
        } else {
            available_keys = new ArrayList<>();
        }
    }

    @Override
    public String toString() {
        return "GetRequiredKeys{" +
                "transaction=" + transaction +
                ", available_keys=" + available_keys +
                '}';
    }

    public SignedTransaction getTransaction() {
        return transaction;
    }

    public void setTransaction(SignedTransaction transaction) {
        this.transaction = transaction;
    }

    public List<String> getAvailable_keys() {
        if (available_keys == null) {
            return new ArrayList<>();
        }
        return available_keys;
    }

    public void setAvailable_keys(List<String> available_keys) {
        this.available_keys = available_keys;
    }
}