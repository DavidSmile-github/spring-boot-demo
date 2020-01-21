package com.david.domain.es;


import lombok.Data;

import java.io.Serializable;

/**
 * Created by bignox on 2017/5/31.
 */
@Data
public class EsAdvertisementsGame implements Serializable{
	private static final long serialVersionUID = 4191320695563887919L;
		private Long id;
		private Integer orderNum;

}
