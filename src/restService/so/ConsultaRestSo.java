package restService.so;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ConsultaRestSo {
	
	private Integer id;
	private String name;
	
	
	public ConsultaRestSo() {
		
	}
	public ConsultaRestSo(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
