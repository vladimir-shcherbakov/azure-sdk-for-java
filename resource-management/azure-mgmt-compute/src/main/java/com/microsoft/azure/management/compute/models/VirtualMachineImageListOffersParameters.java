/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.azure.management.compute.models;

/**
* Contains the parameters required to list offers.
*/
public class VirtualMachineImageListOffersParameters extends VirtualMachineImageListPublishersParameters {
    private String publisherName;
    
    /**
    * Required. Publisher identifier. For example: Microsoft.Windows or
    * Canonical.
    * @return The PublisherName value.
    */
    public String getPublisherName() {
        return this.publisherName;
    }
    
    /**
    * Required. Publisher identifier. For example: Microsoft.Windows or
    * Canonical.
    * @param publisherNameValue The PublisherName value.
    */
    public void setPublisherName(final String publisherNameValue) {
        this.publisherName = publisherNameValue;
    }
    
    /**
    * Initializes a new instance of the VirtualMachineImageListOffersParameters
    * class.
    *
    */
    public VirtualMachineImageListOffersParameters() {
        super();
    }
    
    /**
    * Initializes a new instance of the VirtualMachineImageListOffersParameters
    * class with required arguments.
    *
    * @param publisherName Publisher identifier. For example: Microsoft.Windows
    * or Canonical.
    * @param location Location of the PIR, used for orchestration and required
    * by CSM to direct request to appropriate PIR region. Example: westus,
    * eastus.
    */
    public VirtualMachineImageListOffersParameters(String publisherName, String location) {
        if (publisherName == null) {
            throw new NullPointerException("publisherName");
        }
        if (location == null) {
            throw new NullPointerException("location");
        }
        this.setPublisherName(publisherName);
        this.setLocation(location);
    }
}