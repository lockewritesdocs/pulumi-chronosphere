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
    public sealed class DatasetConfigurationTraceDatasetMatchCriteriaTrace
    {
        public readonly Outputs.DatasetConfigurationTraceDatasetMatchCriteriaTraceDuration? Duration;
        public readonly Outputs.DatasetConfigurationTraceDatasetMatchCriteriaTraceError? Error;

        [OutputConstructor]
        private DatasetConfigurationTraceDatasetMatchCriteriaTrace(
            Outputs.DatasetConfigurationTraceDatasetMatchCriteriaTraceDuration? duration,

            Outputs.DatasetConfigurationTraceDatasetMatchCriteriaTraceError? error)
        {
            Duration = duration;
            Error = error;
        }
    }
}