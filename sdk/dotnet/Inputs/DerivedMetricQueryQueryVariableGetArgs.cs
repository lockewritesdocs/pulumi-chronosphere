// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Chronosphere.Inputs
{

    public sealed class DerivedMetricQueryQueryVariableGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("defaultSelector", required: true)]
        public Input<string> DefaultSelector { get; set; } = null!;

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public DerivedMetricQueryQueryVariableGetArgs()
        {
        }
        public static new DerivedMetricQueryQueryVariableGetArgs Empty => new DerivedMetricQueryQueryVariableGetArgs();
    }
}