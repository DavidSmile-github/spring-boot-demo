package com.david.domain.es;

import java.util.Comparator;

/**
 * Created by chenchunxiu on 15/7/30.
 */
public class EsComparatorTag implements Comparator<EsTag> {

    public int compare(EsTag o1, EsTag o2) {
        return o1.getParentId().compareTo(o2.getParentId());
    }

}
