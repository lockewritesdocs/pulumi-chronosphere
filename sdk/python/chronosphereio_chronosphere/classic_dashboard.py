# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['ClassicDashboardArgs', 'ClassicDashboard']

@pulumi.input_type
class ClassicDashboardArgs:
    def __init__(__self__, *,
                 dashboard_json: pulumi.Input[str],
                 bucket_id: Optional[pulumi.Input[str]] = None,
                 collection_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ClassicDashboard resource.
        """
        pulumi.set(__self__, "dashboard_json", dashboard_json)
        if bucket_id is not None:
            pulumi.set(__self__, "bucket_id", bucket_id)
        if collection_id is not None:
            pulumi.set(__self__, "collection_id", collection_id)

    @property
    @pulumi.getter(name="dashboardJson")
    def dashboard_json(self) -> pulumi.Input[str]:
        return pulumi.get(self, "dashboard_json")

    @dashboard_json.setter
    def dashboard_json(self, value: pulumi.Input[str]):
        pulumi.set(self, "dashboard_json", value)

    @property
    @pulumi.getter(name="bucketId")
    def bucket_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "bucket_id")

    @bucket_id.setter
    def bucket_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bucket_id", value)

    @property
    @pulumi.getter(name="collectionId")
    def collection_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "collection_id")

    @collection_id.setter
    def collection_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "collection_id", value)


@pulumi.input_type
class _ClassicDashboardState:
    def __init__(__self__, *,
                 bucket_id: Optional[pulumi.Input[str]] = None,
                 collection_id: Optional[pulumi.Input[str]] = None,
                 dashboard_json: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ClassicDashboard resources.
        """
        if bucket_id is not None:
            pulumi.set(__self__, "bucket_id", bucket_id)
        if collection_id is not None:
            pulumi.set(__self__, "collection_id", collection_id)
        if dashboard_json is not None:
            pulumi.set(__self__, "dashboard_json", dashboard_json)

    @property
    @pulumi.getter(name="bucketId")
    def bucket_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "bucket_id")

    @bucket_id.setter
    def bucket_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bucket_id", value)

    @property
    @pulumi.getter(name="collectionId")
    def collection_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "collection_id")

    @collection_id.setter
    def collection_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "collection_id", value)

    @property
    @pulumi.getter(name="dashboardJson")
    def dashboard_json(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "dashboard_json")

    @dashboard_json.setter
    def dashboard_json(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dashboard_json", value)


class ClassicDashboard(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bucket_id: Optional[pulumi.Input[str]] = None,
                 collection_id: Optional[pulumi.Input[str]] = None,
                 dashboard_json: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Create a ClassicDashboard resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ClassicDashboardArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a ClassicDashboard resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param ClassicDashboardArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ClassicDashboardArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 bucket_id: Optional[pulumi.Input[str]] = None,
                 collection_id: Optional[pulumi.Input[str]] = None,
                 dashboard_json: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ClassicDashboardArgs.__new__(ClassicDashboardArgs)

            __props__.__dict__["bucket_id"] = bucket_id
            __props__.__dict__["collection_id"] = collection_id
            if dashboard_json is None and not opts.urn:
                raise TypeError("Missing required property 'dashboard_json'")
            __props__.__dict__["dashboard_json"] = dashboard_json
        super(ClassicDashboard, __self__).__init__(
            'chronosphere:index/classicDashboard:ClassicDashboard',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            bucket_id: Optional[pulumi.Input[str]] = None,
            collection_id: Optional[pulumi.Input[str]] = None,
            dashboard_json: Optional[pulumi.Input[str]] = None) -> 'ClassicDashboard':
        """
        Get an existing ClassicDashboard resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ClassicDashboardState.__new__(_ClassicDashboardState)

        __props__.__dict__["bucket_id"] = bucket_id
        __props__.__dict__["collection_id"] = collection_id
        __props__.__dict__["dashboard_json"] = dashboard_json
        return ClassicDashboard(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="bucketId")
    def bucket_id(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "bucket_id")

    @property
    @pulumi.getter(name="collectionId")
    def collection_id(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "collection_id")

    @property
    @pulumi.getter(name="dashboardJson")
    def dashboard_json(self) -> pulumi.Output[str]:
        return pulumi.get(self, "dashboard_json")
