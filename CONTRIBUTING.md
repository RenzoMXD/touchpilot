# Contributing

TouchPilot is early. Contributions should keep the project Android-first,
auditable, and safe by default.

## Development Principles

- Prefer native Android APIs for device control.
- Keep tool schemas explicit and typed.
- Add risk levels to new tools.
- Add logs for agent decisions and tool execution.
- Avoid broad permissions unless the feature clearly needs them.
- Keep user-facing automation reversible or confirmable where possible.

## Suggested Workflow

1. Open an issue describing the feature or bug.
2. Keep pull requests focused.
3. Include screenshots or logs for UI/runtime changes when possible.
4. Update docs when changing architecture, tools, permissions, or safety policy.

## Code Style

- Kotlin for Android app and runtime code.
- C++ only for performance-sensitive native modules such as local inference.
- TypeScript is acceptable for web dashboards, docs tooling, or external
  examples.
- Python is acceptable for experiments, evaluation scripts, and prototypes.

## Safety Review

Any change touching AccessibilityService, screen capture, notifications,
contacts, SMS, files, or outbound sharing must include a short safety note in
the pull request.
