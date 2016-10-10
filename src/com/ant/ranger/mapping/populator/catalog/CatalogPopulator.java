package com.ant.ranger.mapping.populator.catalog;

import com.ant.ranger.data.CatalogData;
import com.ant.ranger.entity.Catalog;
import com.ant.ranger.mapping.populator.AbstractPopulator;
import org.apache.commons.collections.CollectionUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @packgeName: com.ant.ranger.mapping.populator.catalog
 * @ClassName: CatalogPopulator
 * @copyright: Copyright 2016-2027 Markor Investment Group Co. LTD. All Rights Reserved.
 * @description:<描述>
 * @author: hexinlei
 * @date: 16/9/10-上午11:39
 * @version: 1.0
 * @since: JDK 1.8
 */
public class CatalogPopulator implements AbstractPopulator<Catalog,CatalogData>{

    @Resource
    private CatalogPopulator catalogPopulator;

    @Override
    public void populator(Catalog catalog, CatalogData catalogData) {
        catalogData.setCode(catalog.getCode());
        catalogData.setName(catalog.getName());
        catalogData.setDescription(catalog.getDescription());
        catalogData.setCid(null!=catalog.getParentCatalog()?catalog.getParentCatalog().getCode():"");
        catalogData.setLevel(catalog.getLevel());

        Set<Catalog> children = catalog.getChildCatalogs();
        if (CollectionUtils.isNotEmpty(children)){
            List<CatalogData> child = new ArrayList<>();

            for (Catalog value : children){
                CatalogData data = new CatalogData();
                catalogPopulator.populator(value,data);
                child.add(data);
            }
            catalogData.setDataSet(child);
        }
    }
}
