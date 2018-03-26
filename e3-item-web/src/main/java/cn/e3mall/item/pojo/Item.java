package cn.e3mall.item.pojo;

import java.io.Serializable;

import cn.e3mall.pojo.TbItem;

public class Item extends TbItem implements Serializable {

	private static final long serialVersionUID = 1L;

	public Item(TbItem tbItem) {
		this.setId(tbItem.getId());
		this.setTitle(tbItem.getTitle());
		this.setSellPoint(tbItem.getSellPoint());
		this.setPrice(tbItem.getPrice());
		this.setNum(tbItem.getNum());
		this.setBarcode(tbItem.getBarcode());
		this.setImage(tbItem.getImage());
		this.setCid(tbItem.getCid());
		this.setStatus(tbItem.getStatus());
		this.setCreated(tbItem.getCreated());
		this.setUpdated(tbItem.getUpdated());
	}

	public String[] getImages() {
		String image2 = this.getImage();
		if (null != image2 && !"".equals(image2)) {
			String[] split = image2.split(",");
			return split;
		}
		return null;
	}
}
