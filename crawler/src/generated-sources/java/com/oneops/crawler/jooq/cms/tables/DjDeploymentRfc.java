/*
 * This file is generated by jOOQ.
*/
package com.oneops.crawler.jooq.cms.tables;


import com.oneops.crawler.jooq.cms.Indexes;
import com.oneops.crawler.jooq.cms.Keys;
import com.oneops.crawler.jooq.cms.Kloopzcm;
import com.oneops.crawler.jooq.cms.tables.records.DjDeploymentRfcRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DjDeploymentRfc extends TableImpl<DjDeploymentRfcRecord> {

    private static final long serialVersionUID = 94405820;

    /**
     * The reference instance of <code>kloopzcm.dj_deployment_rfc</code>
     */
    public static final DjDeploymentRfc DJ_DEPLOYMENT_RFC = new DjDeploymentRfc();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DjDeploymentRfcRecord> getRecordType() {
        return DjDeploymentRfcRecord.class;
    }

    /**
     * The column <code>kloopzcm.dj_deployment_rfc.deployment_rfc_id</code>.
     */
    public final TableField<DjDeploymentRfcRecord, Long> DEPLOYMENT_RFC_ID = createField("deployment_rfc_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>kloopzcm.dj_deployment_rfc.deployment_id</code>.
     */
    public final TableField<DjDeploymentRfcRecord, Long> DEPLOYMENT_ID = createField("deployment_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>kloopzcm.dj_deployment_rfc.state_id</code>.
     */
    public final TableField<DjDeploymentRfcRecord, Integer> STATE_ID = createField("state_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>kloopzcm.dj_deployment_rfc.rfc_id</code>.
     */
    public final TableField<DjDeploymentRfcRecord, Long> RFC_ID = createField("rfc_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>kloopzcm.dj_deployment_rfc.comments</code>.
     */
    public final TableField<DjDeploymentRfcRecord, String> COMMENTS = createField("comments", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>kloopzcm.dj_deployment_rfc.created</code>.
     */
    public final TableField<DjDeploymentRfcRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>kloopzcm.dj_deployment_rfc.updated</code>.
     */
    public final TableField<DjDeploymentRfcRecord, Timestamp> UPDATED = createField("updated", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>kloopzcm.dj_deployment_rfc.ops</code>.
     */
    public final TableField<DjDeploymentRfcRecord, String> OPS = createField("ops", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>kloopzcm.dj_deployment_rfc</code> table reference
     */
    public DjDeploymentRfc() {
        this(DSL.name("dj_deployment_rfc"), null);
    }

    /**
     * Create an aliased <code>kloopzcm.dj_deployment_rfc</code> table reference
     */
    public DjDeploymentRfc(String alias) {
        this(DSL.name(alias), DJ_DEPLOYMENT_RFC);
    }

    /**
     * Create an aliased <code>kloopzcm.dj_deployment_rfc</code> table reference
     */
    public DjDeploymentRfc(Name alias) {
        this(alias, DJ_DEPLOYMENT_RFC);
    }

    private DjDeploymentRfc(Name alias, Table<DjDeploymentRfcRecord> aliased) {
        this(alias, aliased, null);
    }

    private DjDeploymentRfc(Name alias, Table<DjDeploymentRfcRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Kloopzcm.KLOOPZCM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.DJ_DEPLOYMENT_RFC_D_IDX1, Indexes.DJ_DEPLOYMENT_RFC_IDX, Indexes.DJ_DEPLOYMENT_RFC_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DjDeploymentRfcRecord> getPrimaryKey() {
        return Keys.DJ_DEPLOYMENT_RFC_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DjDeploymentRfcRecord>> getKeys() {
        return Arrays.<UniqueKey<DjDeploymentRfcRecord>>asList(Keys.DJ_DEPLOYMENT_RFC_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<DjDeploymentRfcRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<DjDeploymentRfcRecord, ?>>asList(Keys.DJ_DEPLOYMENT_RFC__DJ_DEPLOYMENT_DJ_DEPLOYMENT_RFC_FK, Keys.DJ_DEPLOYMENT_RFC__DJ_DEPLOYMENT_RFC_DPRFCSTID_FK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjDeploymentRfc as(String alias) {
        return new DjDeploymentRfc(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjDeploymentRfc as(Name alias) {
        return new DjDeploymentRfc(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DjDeploymentRfc rename(String name) {
        return new DjDeploymentRfc(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DjDeploymentRfc rename(Name name) {
        return new DjDeploymentRfc(name, null);
    }
}
