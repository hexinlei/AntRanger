package com.ant.ranger.mapping.conventer.catalog;

import com.ant.ranger.data.CatalogData;
import com.ant.ranger.entity.Catalog;
import com.ant.ranger.mapping.conventer.AbstractPopulatorConverter;
import org.springframework.core.convert.ConversionException;

/**
 * @packgeName: com.ant.ranger.mapping.conventer.catalog
 * @ClassName: CatalogConventer
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/9/10-上午11:01
 * @version: 1.0
 * @since: JDK 1.8
 */
public class CatalogConventer extends AbstractPopulatorConverter<Catalog,CatalogData>{
    @Override
    public CatalogData convert(Catalog catalog, CatalogData catalogData) throws ConversionException {
        CatalogData target = createTarget();
        populator(catalog,target);
        return target;
    }

    @Override
    protected CatalogData createTarget() {
        return new CatalogData();
    }
}
