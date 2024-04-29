// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Chronosphere.Inputs
{

    public sealed class NotificationPolicyDataSourceOverrideRoute : global::Pulumi.InvokeArgs
    {
        [Input("notifiers")]
        private List<string>? _notifiers;
        public List<string> Notifiers
        {
            get => _notifiers ?? (_notifiers = new List<string>());
            set => _notifiers = value;
        }

        [Input("repeatInterval")]
        public string? RepeatInterval { get; set; }

        [Input("severity", required: true)]
        public string Severity { get; set; } = null!;

        public NotificationPolicyDataSourceOverrideRoute()
        {
        }
        public static new NotificationPolicyDataSourceOverrideRoute Empty => new NotificationPolicyDataSourceOverrideRoute();
    }
}