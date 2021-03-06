package org.wso2.carbon.identity.organization.mgt.endpoint.dto;

import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.NotNull;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@ApiModel(description = "")
public class OrganizationDTO {

    @NotNull
    private String id = null;

    @NotNull
    private String name = null;

    private String displayName = null;

    private String description = null;

    public enum StatusEnum {
        ACTIVE, DISABLED,
    }

    @NotNull
    private StatusEnum status = null;

    @NotNull
    private ParentDTO parent = null;

    @NotNull
    private MetaDTO meta = null;

    private List<AttributeDTO> attributes = new ArrayList<AttributeDTO>();

    private List<String> permissions = new ArrayList<String>();

    /**
     *
     **/
    @ApiModelProperty(required = true,
                      value = "")
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     **/
    @ApiModelProperty(required = true,
                      value = "")
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     **/
    @ApiModelProperty(value = "")
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     *
     **/
    @ApiModelProperty(value = "")
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     **/
    @ApiModelProperty(required = true,
                      value = "")
    @JsonProperty("status")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    /**
     *
     **/
    @ApiModelProperty(required = true,
                      value = "")
    @JsonProperty("parent")
    public ParentDTO getParent() {
        return parent;
    }

    public void setParent(ParentDTO parent) {
        this.parent = parent;
    }

    /**
     *
     **/
    @ApiModelProperty(required = true,
                      value = "")
    @JsonProperty("meta")
    public MetaDTO getMeta() {
        return meta;
    }

    public void setMeta(MetaDTO meta) {
        this.meta = meta;
    }

    /**
     *
     **/
    @ApiModelProperty(value = "")
    @JsonProperty("attributes")
    public List<AttributeDTO> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<AttributeDTO> attributes) {
        this.attributes = attributes;
    }

    /**
     *
     **/
    @ApiModelProperty(value = "")
    @JsonProperty("permissions")
    public List<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrganizationDTO {\n");

        sb.append("  id: ").append(id).append("\n");
        sb.append("  name: ").append(name).append("\n");
        sb.append("  displayName: ").append(displayName).append("\n");
        sb.append("  description: ").append(description).append("\n");
        sb.append("  status: ").append(status).append("\n");
        sb.append("  parent: ").append(parent).append("\n");
        sb.append("  meta: ").append(meta).append("\n");
        sb.append("  attributes: ").append(attributes).append("\n");
        sb.append("  permissions: ").append(permissions).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
