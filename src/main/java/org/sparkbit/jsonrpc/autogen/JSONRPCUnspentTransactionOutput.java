package org.sparkbit.jsonrpc.autogen;

/**
 * DO NOT EDIT THIS FILE!
 * 
 * Generated by Barrister Idl2Java: https://github.com/coopernurse/barrister-java
 * 
 * Generated at: Fri Jan 02 14:08:47 PST 2015
 */
public class JSONRPCUnspentTransactionOutput implements com.bitmechanic.barrister.BStruct {


    public static class Builder {
        private String _txid;
        public Builder txid(String txid) { this._txid = txid; return this; }
        private Long _vout;
        public Builder vout(Long vout) { this._vout = vout; return this; }
        private String _bitcoin_address;
        public Builder bitcoin_address(String bitcoin_address) { this._bitcoin_address = bitcoin_address; return this; }
        private String _coinspark_address;
        public Builder coinspark_address(String coinspark_address) { this._coinspark_address = coinspark_address; return this; }
        private String _scriptPubKey;
        public Builder scriptPubKey(String scriptPubKey) { this._scriptPubKey = scriptPubKey; return this; }
        private JSONRPCBalance[] _amounts;
        public Builder amounts(JSONRPCBalance[] amounts) { this._amounts = amounts; return this; }
        private Long _confirmations;
        public Builder confirmations(Long confirmations) { this._confirmations = confirmations; return this; }
        public JSONRPCUnspentTransactionOutput build() {
            return new JSONRPCUnspentTransactionOutput(this._txid, this._vout, this._bitcoin_address, this._coinspark_address, this._scriptPubKey, this._amounts, this._confirmations);
        }

        public Builder() { }
        public Builder(JSONRPCUnspentTransactionOutput obj) {
            this._txid = obj.getTxid();
            this._vout = obj.getVout();
            this._bitcoin_address = obj.getBitcoin_address();
            this._coinspark_address = obj.getCoinspark_address();
            this._scriptPubKey = obj.getScriptPubKey();
            this._amounts = obj.getAmounts();
            this._confirmations = obj.getConfirmations();
        }
    }

    private String bitcoin_address;
    private JSONRPCBalance[] amounts;
    private Long confirmations;
    private String scriptPubKey;
    private Long vout;
    private String txid;
    private String coinspark_address;

    public JSONRPCUnspentTransactionOutput() {
        super();
    }

    public JSONRPCUnspentTransactionOutput(java.util.Map _map) throws com.bitmechanic.barrister.RpcException {
        this(
            (String)com.bitmechanic.barrister.StringTypeConverter.unmarshal(_map.get("txid"), false),
            (Long)com.bitmechanic.barrister.IntTypeConverter.unmarshal(_map.get("vout"), false),
            (String)com.bitmechanic.barrister.StringTypeConverter.unmarshal(_map.get("bitcoin_address"), false),
            (String)com.bitmechanic.barrister.StringTypeConverter.unmarshal(_map.get("coinspark_address"), true),
            (String)com.bitmechanic.barrister.StringTypeConverter.unmarshal(_map.get("scriptPubKey"), false),
            (JSONRPCBalance[])com.bitmechanic.barrister.ArrayTypeConverter.unmarshalList(JSONRPCBalance.class, _map.get("amounts"), false),
            (Long)com.bitmechanic.barrister.IntTypeConverter.unmarshal(_map.get("confirmations"), false)
        );
    }

    @org.codehaus.jackson.annotate.JsonCreator
    public JSONRPCUnspentTransactionOutput(
            @org.codehaus.jackson.annotate.JsonProperty("txid") String txid, 
            @org.codehaus.jackson.annotate.JsonProperty("vout") Long vout, 
            @org.codehaus.jackson.annotate.JsonProperty("bitcoin_address") String bitcoin_address, 
            @org.codehaus.jackson.annotate.JsonProperty("coinspark_address") String coinspark_address, 
            @org.codehaus.jackson.annotate.JsonProperty("scriptPubKey") String scriptPubKey, 
            @org.codehaus.jackson.annotate.JsonProperty("amounts") JSONRPCBalance[] amounts, 
            @org.codehaus.jackson.annotate.JsonProperty("confirmations") Long confirmations) {
        super();
        this.txid = txid;
        this.vout = vout;
        this.bitcoin_address = bitcoin_address;
        this.coinspark_address = coinspark_address;
        this.scriptPubKey = scriptPubKey;
        this.amounts = amounts;
        this.confirmations = confirmations;
    }

    public void setBitcoin_address(String bitcoin_address) {
        this.bitcoin_address = bitcoin_address;
    }

    public String getBitcoin_address() {
        return this.bitcoin_address;
    }

    public void setAmounts(JSONRPCBalance[] amounts) {
        this.amounts = amounts;
    }

    public JSONRPCBalance[] getAmounts() {
        return this.amounts;
    }

    public void setConfirmations(Long confirmations) {
        this.confirmations = confirmations;
    }

    public Long getConfirmations() {
        return this.confirmations;
    }

    public void setScriptPubKey(String scriptPubKey) {
        this.scriptPubKey = scriptPubKey;
    }

    public String getScriptPubKey() {
        return this.scriptPubKey;
    }

    public void setVout(Long vout) {
        this.vout = vout;
    }

    public Long getVout() {
        return this.vout;
    }

    public void setTxid(String txid) {
        this.txid = txid;
    }

    public String getTxid() {
        return this.txid;
    }

    public void setCoinspark_address(String coinspark_address) {
        this.coinspark_address = coinspark_address;
    }

    public String getCoinspark_address() {
        return this.coinspark_address;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("JSONRPCUnspentTransactionOutput:");
        sb.append(" bitcoin_address=").append(bitcoin_address);
        sb.append(" amounts=").append(amounts);
        sb.append(" confirmations=").append(confirmations);
        sb.append(" scriptPubKey=").append(scriptPubKey);
        sb.append(" vout=").append(vout);
        sb.append(" txid=").append(txid);
        sb.append(" coinspark_address=").append(coinspark_address);
        return sb.toString();
    }

    @Override
    public boolean equals(Object _other) {
        if (this == _other) { return true; }
        if (_other == null) { return false; }
        if (!(_other instanceof JSONRPCUnspentTransactionOutput)) { return false; }
        JSONRPCUnspentTransactionOutput _o = (JSONRPCUnspentTransactionOutput)_other;
        if (bitcoin_address == null && _o.bitcoin_address != null) { return false; }
        else if (bitcoin_address != null && !bitcoin_address.equals(_o.bitcoin_address)) { return false; }
        if (amounts == null && _o.amounts != null) { return false; }
        else if (amounts != null && !java.util.Arrays.equals(amounts, _o.amounts)) { return false; }
        if (confirmations == null && _o.confirmations != null) { return false; }
        else if (confirmations != null && !confirmations.equals(_o.confirmations)) { return false; }
        if (scriptPubKey == null && _o.scriptPubKey != null) { return false; }
        else if (scriptPubKey != null && !scriptPubKey.equals(_o.scriptPubKey)) { return false; }
        if (vout == null && _o.vout != null) { return false; }
        else if (vout != null && !vout.equals(_o.vout)) { return false; }
        if (txid == null && _o.txid != null) { return false; }
        else if (txid != null && !txid.equals(_o.txid)) { return false; }
        if (coinspark_address == null && _o.coinspark_address != null) { return false; }
        else if (coinspark_address != null && !coinspark_address.equals(_o.coinspark_address)) { return false; }
        return true;
    }

    @Override
    public int hashCode() {
        int _hash = 1;
        _hash = _hash * 31 + (bitcoin_address == null ? 0 : bitcoin_address.hashCode());
        _hash = _hash * 31 + (amounts == null ? 0 : java.util.Arrays.hashCode(amounts));
        _hash = _hash * 31 + (confirmations == null ? 0 : confirmations.hashCode());
        _hash = _hash * 31 + (scriptPubKey == null ? 0 : scriptPubKey.hashCode());
        _hash = _hash * 31 + (vout == null ? 0 : vout.hashCode());
        _hash = _hash * 31 + (txid == null ? 0 : txid.hashCode());
        _hash = _hash * 31 + (coinspark_address == null ? 0 : coinspark_address.hashCode());
        return _hash;
    }
}

