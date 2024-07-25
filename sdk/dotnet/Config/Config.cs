// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Immutable;

namespace Chronosphere.Pulumi
{
    public static class Config
    {
        [global::System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Design", "IDE1006", Justification = 
        "Double underscore prefix used to avoid conflicts with variable names.")]
        private sealed class __Value<T>
        {
            private readonly Func<T> _getter;
            private T _value = default!;
            private bool _set;

            public __Value(Func<T> getter)
            {
                _getter = getter;
            }

            public T Get() => _set ? _value : _getter();

            public void Set(T value)
            {
                _value = value;
                _set = true;
            }
        }

        private static readonly global::Pulumi.Config __config = new global::Pulumi.Config("chronosphere");

        private static readonly __Value<string?> _apiToken = new __Value<string?>(() => __config.Get("apiToken") ?? Utilities.GetEnv("CHRONOSPHERE_API_TOKEN"));
        public static string? ApiToken
        {
            get => _apiToken.Get();
            set => _apiToken.Set(value);
        }

        private static readonly __Value<string?> _entityNamespace = new __Value<string?>(() => __config.Get("entityNamespace"));
        public static string? EntityNamespace
        {
            get => _entityNamespace.Get();
            set => _entityNamespace.Set(value);
        }

        private static readonly __Value<string?> _org = new __Value<string?>(() => __config.Get("org") ?? Utilities.GetEnv("CHRONOSPHERE_ORG", "CHRONOSPHERE_ORG_NAME"));
        public static string? Org
        {
            get => _org.Get();
            set => _org.Set(value);
        }

        private static readonly __Value<bool?> _unstable = new __Value<bool?>(() => __config.GetBoolean("unstable"));
        public static bool? Unstable
        {
            get => _unstable.Get();
            set => _unstable.Set(value);
        }

    }
}
