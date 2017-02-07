/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.management.compute.implementation;

import com.microsoft.azure.PagedList;
import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.management.compute.AvailabilitySet;
import com.microsoft.azure.management.compute.AvailabilitySets;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.implementation.GroupableResourcesImpl;
import com.microsoft.azure.management.resources.fluentcore.arm.models.implementation.GroupPagedList;
import rx.Completable;

import java.util.List;

/**
 * The implementation for AvailabilitySets.
 */
@LangDefinition
class AvailabilitySetsImpl
    extends GroupableResourcesImpl<
        AvailabilitySet,
        AvailabilitySetImpl,
        AvailabilitySetInner,
        AvailabilitySetsInner,
        ComputeManager>
    implements AvailabilitySets {

    AvailabilitySetsImpl(final ComputeManager computeManager) {
        super(computeManager.inner().availabilitySets(), computeManager);
    }

    @Override
    public PagedList<AvailabilitySet> list() {
        final AvailabilitySetsImpl self = this;
        return new GroupPagedList<AvailabilitySet>(this.manager().resourceManager().resourceGroups().list()) {
            @Override
            public List<AvailabilitySet> listNextGroup(String resourceGroupName) {
                return wrapList(self.inner().list(resourceGroupName));
            }
        };
    }

    @Override
    public PagedList<AvailabilitySet> listByGroup(String groupName) {
        return wrapList(this.inner().list(groupName));
    }

    @Override
    public AvailabilitySetImpl getByGroup(String groupName, String name) {
        AvailabilitySetInner response = this.inner().get(groupName, name);
        return wrapModel(response);
    }

    @Override
    public AvailabilitySetImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Completable deleteByGroupAsync(String groupName, String name) {
        return this.inner().deleteAsync(groupName, name).toCompletable();
    }

    /**************************************************************
     * Fluent model helpers.
     **************************************************************/

    @Override
    protected AvailabilitySetImpl wrapModel(String name) {
        return new AvailabilitySetImpl(name,
                new AvailabilitySetInner(),
                this.manager());
    }

    @Override
    protected AvailabilitySetImpl wrapModel(AvailabilitySetInner availabilitySetInner) {
        if (availabilitySetInner == null) {
            return null;
        }
        return new AvailabilitySetImpl(availabilitySetInner.name(),
                availabilitySetInner,
                this.manager());
    }
}
