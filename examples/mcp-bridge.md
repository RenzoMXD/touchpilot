# MCP Bridge Example

Future TouchPilot versions may expose Android tools through MCP and may also
consume external MCP tools.

Suggested split:

- Native Kotlin tools remain the primary Android control layer.
- MCP is used for external tools and interoperability.
- Every MCP tool receives the same risk classification and approval policy as
native tools.
