package br.com.petx.adverts.microservice.dtos;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PictureDto implements Serializable{

	private static final long serialVersionUID = 3112317924511683646L;

	private Integer advertId;
	private String base64;
	public Integer getAdvertId() {
		return advertId;
	}
	public void setAdvertId(Integer advertId) {
		this.advertId = advertId;
	}
	public String getBase64() {
		return base64;
	}
	public void setBase64(String base64) {
		this.base64 = base64;
	}
	
	public PictureDto() {
		super();
	}
	public PictureDto(Integer advertId, String base64) {
		super();
		this.advertId = advertId;
		this.base64 = base64;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((advertId == null) ? 0 : advertId.hashCode());
		result = prime * result + ((base64 == null) ? 0 : base64.hashCode());
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
		PictureDto other = (PictureDto) obj;
		if (advertId == null) {
			if (other.advertId != null)
				return false;
		} else if (!advertId.equals(other.advertId))
			return false;
		if (base64 == null) {
			if (other.base64 != null)
				return false;
		} else if (!base64.equals(other.base64))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "FotosDto [advertId=" + advertId + ", base64=" + base64 + "]";
	}
	
}
