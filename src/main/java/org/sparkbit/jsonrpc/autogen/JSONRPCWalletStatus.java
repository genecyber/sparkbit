package org.sparkbit.jsonrpc.autogen;

/**
 * DO NOT EDIT THIS FILE!
 * 
 * Generated by Barrister Idl2Java: https://github.com/coopernurse/barrister-java
 * 
 * Generated at: Sun Nov 16 10:47:14 PST 2014
 */
public class JSONRPCWalletStatus implements com.bitmechanic.barrister.BStruct {


    public static class Builder {
        private String _name;
        public Builder name(String name) { this._name = name; return this; }
        private Boolean _synced;
        public Builder synced(Boolean synced) { this._synced = synced; return this; }
        private Long _blocks;
        public Builder blocks(Long blocks) { this._blocks = blocks; return this; }
        public JSONRPCWalletStatus build() {
            return new JSONRPCWalletStatus(this._name, this._synced, this._blocks);
        }

        public Builder() { }
        public Builder(JSONRPCWalletStatus obj) {
            this._name = obj.getName();
            this._synced = obj.getSynced();
            this._blocks = obj.getBlocks();
        }
    }

    private Boolean synced;
    private String name;
    private Long blocks;

    public JSONRPCWalletStatus() {
        super();
    }

    public JSONRPCWalletStatus(java.util.Map _map) throws com.bitmechanic.barrister.RpcException {
        this(
            (String)com.bitmechanic.barrister.StringTypeConverter.unmarshal(_map.get("name"), false),
            (Boolean)com.bitmechanic.barrister.BoolTypeConverter.unmarshal(_map.get("synced"), false),
            (Long)com.bitmechanic.barrister.IntTypeConverter.unmarshal(_map.get("blocks"), false)
        );
    }

    @org.codehaus.jackson.annotate.JsonCreator
    public JSONRPCWalletStatus(
            @org.codehaus.jackson.annotate.JsonProperty("name") String name, 
            @org.codehaus.jackson.annotate.JsonProperty("synced") Boolean synced, 
            @org.codehaus.jackson.annotate.JsonProperty("blocks") Long blocks) {
        super();
        this.name = name;
        this.synced = synced;
        this.blocks = blocks;
    }

    public void setSynced(Boolean synced) {
        this.synced = synced;
    }

    public Boolean getSynced() {
        return this.synced;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setBlocks(Long blocks) {
        this.blocks = blocks;
    }

    public Long getBlocks() {
        return this.blocks;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("JSONRPCWalletStatus:");
        sb.append(" synced=").append(synced);
        sb.append(" name=").append(name);
        sb.append(" blocks=").append(blocks);
        return sb.toString();
    }

    @Override
    public boolean equals(Object _other) {
        if (this == _other) { return true; }
        if (_other == null) { return false; }
        if (!(_other instanceof JSONRPCWalletStatus)) { return false; }
        JSONRPCWalletStatus _o = (JSONRPCWalletStatus)_other;
        if (synced == null && _o.synced != null) { return false; }
        else if (synced != null && !synced.equals(_o.synced)) { return false; }
        if (name == null && _o.name != null) { return false; }
        else if (name != null && !name.equals(_o.name)) { return false; }
        if (blocks == null && _o.blocks != null) { return false; }
        else if (blocks != null && !blocks.equals(_o.blocks)) { return false; }
        return true;
    }

    @Override
    public int hashCode() {
        int _hash = 1;
        _hash = _hash * 31 + (synced == null ? 0 : synced.hashCode());
        _hash = _hash * 31 + (name == null ? 0 : name.hashCode());
        _hash = _hash * 31 + (blocks == null ? 0 : blocks.hashCode());
        return _hash;
    }
}

