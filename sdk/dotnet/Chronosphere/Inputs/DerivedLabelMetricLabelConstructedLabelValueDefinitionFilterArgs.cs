// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Chronosphere.Pulumi.Chronosphere.Inputs
{

    public sealed class DerivedLabelMetricLabelConstructedLabelValueDefinitionFilterArgs : global::Pulumi.ResourceArgs
    {
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("valueGlob", required: true)]
        public Input<string> ValueGlob { get; set; } = null!;

        public DerivedLabelMetricLabelConstructedLabelValueDefinitionFilterArgs()
        {
        }
        public static new DerivedLabelMetricLabelConstructedLabelValueDefinitionFilterArgs Empty => new DerivedLabelMetricLabelConstructedLabelValueDefinitionFilterArgs();
    }
}