// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Chronosphere.Outputs
{

    [OutputType]
    public sealed class DatasetConfigurationTraceDatasetMatchCriteriaSpanSpanCount
    {
        public readonly int? Max;
        public readonly int? Min;

        [OutputConstructor]
        private DatasetConfigurationTraceDatasetMatchCriteriaSpanSpanCount(
            int? max,

            int? min)
        {
            Max = max;
            Min = min;
        }
    }
}