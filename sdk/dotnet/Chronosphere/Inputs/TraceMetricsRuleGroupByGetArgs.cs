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

    public sealed class TraceMetricsRuleGroupByGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("key", required: true)]
        public Input<Inputs.TraceMetricsRuleGroupByKeyGetArgs> Key { get; set; } = null!;

        [Input("label", required: true)]
        public Input<string> Label { get; set; } = null!;

        public TraceMetricsRuleGroupByGetArgs()
        {
        }
        public static new TraceMetricsRuleGroupByGetArgs Empty => new TraceMetricsRuleGroupByGetArgs();
    }
}