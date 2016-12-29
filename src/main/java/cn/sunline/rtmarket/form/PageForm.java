package cn.sunline.rtmarket.form;

/**
 * page 表单
 * @author chenpi
 *
 */
public class PageForm {
	
	private int pageno;
	
	private int pagesize = 10;

	public int getPageno() {
		return pageno;
	}

	public void setPageno(int pageno) {
		this.pageno = pageno;
	}

	public int getPagesize() {
		return pagesize;
	}

	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}

}
