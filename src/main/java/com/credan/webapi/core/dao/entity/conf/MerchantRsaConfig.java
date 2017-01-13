package com.credan.webapi.core.dao.entity.conf;

import com.credan.webapi.core.dao.entity.BasicEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class MerchantRsaConfig extends BasicEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column merchant_rsa_config.merchant_id
     *
     * @mbg.generated Fri Jan 13 10:54:32 CST 2017
     */
    private String merchantId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column merchant_rsa_config.id
     *
     * @mbg.generated Fri Jan 13 10:54:32 CST 2017
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column merchant_rsa_config.credan_rsa_private_key
     *
     * @mbg.generated Fri Jan 13 10:54:32 CST 2017
     */
    private String credanRsaPrivateKey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column merchant_rsa_config.credan_rsa_public_key
     *
     * @mbg.generated Fri Jan 13 10:54:32 CST 2017
     */
    private String credanRsaPublicKey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column merchant_rsa_config.rsa_private_key
     *
     * @mbg.generated Fri Jan 13 10:54:32 CST 2017
     */
    private String rsaPrivateKey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column merchant_rsa_config.rsa_public_key
     *
     * @mbg.generated Fri Jan 13 10:54:32 CST 2017
     */
    private String rsaPublicKey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column merchant_rsa_config.aes_key
     *
     * @mbg.generated Fri Jan 13 10:54:32 CST 2017
     */
    private String aesKey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column merchant_rsa_config.environment
     *
     * @mbg.generated Fri Jan 13 10:54:32 CST 2017
     */
    private String environment;
    
    private String notifyUrl;

}