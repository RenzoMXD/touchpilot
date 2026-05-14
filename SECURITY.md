# Security

TouchPilot controls real Android apps. Treat every model output, inbound
message, webpage, notification, and app screen as untrusted input.

## Security Principles

- Tools are denied by default until explicitly enabled.
- Risky actions require user approval.
- Every tool call is logged with input, output, timestamp, and result.
- Secrets are stored only through Android Keystore-backed storage.
- The app must show a persistent foreground notification while automation is
  active.
- The agent should prefer semantic UI selectors over raw coordinates.

## Tool Risk Levels

- `low`: observe screen, list apps, read non-sensitive local state.
- `medium`: tap, type, scroll, open app, press back/home.
- `high`: send message, share file, create calendar event, modify settings.
- `blocked`: passwords, purchases, banking, destructive account operations,
  sensitive exfiltration.

## Sensitive Surfaces

The following require extra review before implementation:

- SMS and call logs,
- contacts,
- email,
- notifications,
- files outside app-owned storage,
- screen capture,
- app installation or removal,
- payments or shopping,
- authentication and password managers.

## Reporting Issues

Open a GitHub issue for non-sensitive bugs. For security-sensitive reports,
avoid posting secrets, screenshots, tokens, private messages, or device logs in
public issues.
