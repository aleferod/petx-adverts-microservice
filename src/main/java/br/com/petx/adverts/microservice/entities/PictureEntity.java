package br.com.petx.adverts.microservice.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity(name="picture")
public class PictureEntity implements Serializable{

	private static final long serialVersionUID = -7931036156832320780L;
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private long advertId;
	@Lob 
	@Column(name="base64", length=52428800)
	private String base64;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public long getAdvertId() {
		return advertId;
	}
	public void setAdvertId(long advertId) {
		this.advertId = advertId;
	}
	public String getBase64() {
		return base64;
	}
	public void setBase64(String base64) {
		this.base64 = base64;
	}
	
	public PictureEntity() {
		super();
	}
	public PictureEntity(Long id, long advertId, String base64) {
		super();
		this.id = id;
		this.advertId = advertId;
		this.base64 = base64;
	}
	
	public PictureEntity(long advertId, String base64) {
		super();
		this.advertId = advertId;
		this.base64 = base64;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (advertId ^ (advertId >>> 32));
		result = prime * result + ((base64 == null) ? 0 : base64.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PictureEntity other = (PictureEntity) obj;
		if (advertId != other.advertId)
			return false;
		if (base64 == null) {
			if (other.base64 != null)
				return false;
		} else if (!base64.equals(other.base64))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PictureEntity [id=" + id + ", advertId=" + advertId + ", base64=" + base64 + "]";
	}
	
	

}
