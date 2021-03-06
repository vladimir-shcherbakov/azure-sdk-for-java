/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of an artifact deployment.
 */
public class ArtifactDeploymentStatusPropertiesFragment {
    /**
     * The deployment status of the artifact.
     */
    @JsonProperty(value = "deploymentStatus")
    private String deploymentStatus;

    /**
     * The total count of the artifacts that were successfully applied.
     */
    @JsonProperty(value = "artifactsApplied")
    private Integer artifactsApplied;

    /**
     * The total count of the artifacts that were tentatively applied.
     */
    @JsonProperty(value = "totalArtifacts")
    private Integer totalArtifacts;

    /**
     * Get the deploymentStatus value.
     *
     * @return the deploymentStatus value
     */
    public String deploymentStatus() {
        return this.deploymentStatus;
    }

    /**
     * Set the deploymentStatus value.
     *
     * @param deploymentStatus the deploymentStatus value to set
     * @return the ArtifactDeploymentStatusPropertiesFragment object itself.
     */
    public ArtifactDeploymentStatusPropertiesFragment withDeploymentStatus(String deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
        return this;
    }

    /**
     * Get the artifactsApplied value.
     *
     * @return the artifactsApplied value
     */
    public Integer artifactsApplied() {
        return this.artifactsApplied;
    }

    /**
     * Set the artifactsApplied value.
     *
     * @param artifactsApplied the artifactsApplied value to set
     * @return the ArtifactDeploymentStatusPropertiesFragment object itself.
     */
    public ArtifactDeploymentStatusPropertiesFragment withArtifactsApplied(Integer artifactsApplied) {
        this.artifactsApplied = artifactsApplied;
        return this;
    }

    /**
     * Get the totalArtifacts value.
     *
     * @return the totalArtifacts value
     */
    public Integer totalArtifacts() {
        return this.totalArtifacts;
    }

    /**
     * Set the totalArtifacts value.
     *
     * @param totalArtifacts the totalArtifacts value to set
     * @return the ArtifactDeploymentStatusPropertiesFragment object itself.
     */
    public ArtifactDeploymentStatusPropertiesFragment withTotalArtifacts(Integer totalArtifacts) {
        this.totalArtifacts = totalArtifacts;
        return this;
    }

}
