# OpenAI-Compatible Provider Example

TouchPilot should begin with a simple OpenAI-compatible provider interface.

Required settings:

- `base_url`
- `api_key`
- `model`

The agent runtime should treat provider output as untrusted. Structured tool
calls must be parsed, validated, and policy-checked before execution.
