package com.dip.model;

import java.io.Serializable;

/**
 * @author HCL
 *
 */
public class UrlShortnerRequest  {

	private static final long serialVersionUID = 1L;
	/** the url */
    private String url;

    /**
     * @param url
     */
    public void setUrl(final String url) {
        this.url = url;
    }

    /**
     * @return
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * @param url
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    public UrlShortnerRequest url(final String url) {
        setUrl(url);
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
        if (getUrl() != null)
            sb.append("url: ").append(getUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (obj instanceof UrlShortnerRequest == false)
            return false;
        UrlShortnerRequest other = (UrlShortnerRequest) obj;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
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
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }
    /**
     * @return clone of  UrlShortnerRequest object 
     * @see UrlShortnerRequest()
     */
    @Override
    public UrlShortnerRequest clone() {
        try {
            return (UrlShortnerRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}