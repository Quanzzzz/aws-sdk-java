/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of user groups that exist in your OIDC Identity Provider (IdP). One to ten groups can be used to create a
 * single private work team. When you add a user group to the list of <code>Groups</code>, you can add that user group
 * to one or more private work teams. If you add a user group to a private work team, all workers in that user group are
 * added to the work team.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/OidcMemberDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OidcMemberDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of comma seperated strings that identifies user groups in your OIDC IdP. Each user group is made up of a
     * group of private workers.
     * </p>
     */
    private java.util.List<String> groups;

    /**
     * <p>
     * A list of comma seperated strings that identifies user groups in your OIDC IdP. Each user group is made up of a
     * group of private workers.
     * </p>
     * 
     * @return A list of comma seperated strings that identifies user groups in your OIDC IdP. Each user group is made
     *         up of a group of private workers.
     */

    public java.util.List<String> getGroups() {
        return groups;
    }

    /**
     * <p>
     * A list of comma seperated strings that identifies user groups in your OIDC IdP. Each user group is made up of a
     * group of private workers.
     * </p>
     * 
     * @param groups
     *        A list of comma seperated strings that identifies user groups in your OIDC IdP. Each user group is made up
     *        of a group of private workers.
     */

    public void setGroups(java.util.Collection<String> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new java.util.ArrayList<String>(groups);
    }

    /**
     * <p>
     * A list of comma seperated strings that identifies user groups in your OIDC IdP. Each user group is made up of a
     * group of private workers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroups(java.util.Collection)} or {@link #withGroups(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param groups
     *        A list of comma seperated strings that identifies user groups in your OIDC IdP. Each user group is made up
     *        of a group of private workers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OidcMemberDefinition withGroups(String... groups) {
        if (this.groups == null) {
            setGroups(new java.util.ArrayList<String>(groups.length));
        }
        for (String ele : groups) {
            this.groups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of comma seperated strings that identifies user groups in your OIDC IdP. Each user group is made up of a
     * group of private workers.
     * </p>
     * 
     * @param groups
     *        A list of comma seperated strings that identifies user groups in your OIDC IdP. Each user group is made up
     *        of a group of private workers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OidcMemberDefinition withGroups(java.util.Collection<String> groups) {
        setGroups(groups);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getGroups() != null)
            sb.append("Groups: ").append(getGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OidcMemberDefinition == false)
            return false;
        OidcMemberDefinition other = (OidcMemberDefinition) obj;
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        return hashCode;
    }

    @Override
    public OidcMemberDefinition clone() {
        try {
            return (OidcMemberDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.OidcMemberDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
