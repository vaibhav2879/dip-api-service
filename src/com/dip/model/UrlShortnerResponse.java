package com.dip.model;

import java.io.Serializable;

/**
 * @author HCL
 *
 */
public class UrlShortnerResponse implements Serializable, Cloneable {

    /** longUrl */
    private String longUrl;

    /** remark */
    private String remark;

    /** shortUrl */
    private String shortUrl;
    
    private int statusCode;

    /**
     * @param longUrl
     */
    public void setLongUrl(final String longUrl) {
        this.longUrl = longUrl;
    }

    /**
     * @return
     */
    public String getLongUrl() {
        return this.longUrl;
    }

    public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	/**
     * @param longUrl
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    public UrlShortnerResponse longUrl(final String longUrl) {
        setLongUrl(longUrl);
        return this;
    }

    /**
     * @param remark
     */
    public void setRemark(final String remark) {
        this.remark = remark;
    }

    /**
     * @return
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @param remark
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    public UrlShortnerResponse remark(final String remark) {
        setRemark(remark);
        return this;
    }

    /**
     * @param shortUrl
     */
    public void setShortUrl(final String shortUrl) {
        this.shortUrl = shortUrl;
    }

    /**
     * @return
     */
    public String getShortUrl() {
        return this.shortUrl;
    }

    /**
     * @param shortUrl
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    public UrlShortnerResponse shortUrl(final String shortUrl) {
        setShortUrl(shortUrl);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLongUrl() != null)
            sb.append("longUrl: ").append(getLongUrl()).append(",");
        if (getRemark() != null)
            sb.append("remark: ").append(getRemark()).append(",");
        if (getShortUrl() != null)
            sb.append("shortUrl: ").append(getShortUrl());
        sb.append("}");
        return sb.toString();
    }
    /**
     * @return boolean value after comparing object
     * 
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (obj instanceof UrlShortnerResponse == false)
            return false;
        UrlShortnerResponse other = (UrlShortnerResponse) obj;
        if (other.getLongUrl() == null ^ this.getLongUrl() == null)
            return false;
        if (other.getLongUrl() != null && other.getLongUrl().equals(this.getLongUrl()) == false)
            return false;
        if (other.getRemark() == null ^ this.getRemark() == null)
            return false;
        if (other.getRemark() != null && other.getRemark().equals(this.getRemark()) == false)
            return false;
        if (other.getShortUrl() == null ^ this.getShortUrl() == null)
            return false;
        if (other.getShortUrl() != null && other.getShortUrl().equals(this.getShortUrl()) == false)
            return false;
        return true;
    }
    /**
     * @return A int value of hashcode 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        hashCode = prime * hashCode + ((getLongUrl() == null) ? 0 : getLongUrl().hashCode());
        hashCode = prime * hashCode + ((getRemark() == null) ? 0 : getRemark().hashCode());
        hashCode = prime * hashCode + ((getShortUrl() == null) ? 0 : getShortUrl().hashCode());
        return hashCode;
    }
    /**
     * @return clone of  UrlShortnerRequest object 
     * @see UrlShortnerRequest()
     */
    @Override
    public UrlShortnerResponse clone() {
        try {
            return (UrlShortnerResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}